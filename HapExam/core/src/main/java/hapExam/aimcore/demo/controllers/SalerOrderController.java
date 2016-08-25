package hapExam.aimcore.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hapExam.aimcore.demo.dto.SalerOrder;
import hapExam.aimcore.demo.service.SalerOrderService;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 */
@Controller
@Scope("prototype")
public class SalerOrderController extends BaseController {

	@Autowired
	private SalerOrderService salerOrderService;

	@RequestMapping("/salerOrder/query")
	@ResponseBody
	public ResponseData selectList(HttpServletRequest request,
			SalerOrder condition,
			@RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
		IRequest iRequest = createRequestContext(request);
		List<SalerOrder> datas = salerOrderService.getSalerOrderList(iRequest,
				condition, page, pagesize);
		return new ResponseData(datas);
	}

	@RequestMapping("/salerOrderDetail/query")
	@ResponseBody
	public ResponseData selectDetailList(HttpServletRequest request,
			SalerOrder condition,
			@RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
		IRequest iRequest = createRequestContext(request);
		if (condition.getOrder_date() != null) {
			salerOrderService.insertHead(iRequest, condition);
		}
		List<SalerOrder> datas = salerOrderService.getSalerOrderDetailList(
				iRequest, condition, page, pagesize);
		return new ResponseData(datas);
	}

	/*
	 * @RequestMapping(value = "/demo/submit", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public ResponseData submit(HttpServletRequest request,
	 * @RequestBody List<Demo> demos) { IRequest iRequest =
	 * createRequestContext(request); List<Demo> datas =
	 * demoService.batchUpdate(iRequest, demos); return new ResponseData(datas);
	 * }
	 * 
	 * @RequestMapping(value = "/demo/delete", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public ResponseData delete(HttpServletRequest request,
	 * @RequestBody List<Demo> demos) { IRequest iRequest =
	 * createRequestContext(request); demoService.batchDelete(demos); return new
	 * ResponseData(); }
	 */

	@RequestMapping(value = "/salerOrderDetail/editerSalerOrder", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData addLine(@RequestBody List<SalerOrder> salerOrders,
			BindingResult result, HttpServletRequest request) {

		getValidator().validate(salerOrders, result);

		if (result.hasErrors()) {
			ResponseData rd = new ResponseData(false);
			rd.setMessage(getErrorMessage(result, request));
			return rd;
		}

		IRequest requestContext = createRequestContext(request);

		return new ResponseData(salerOrderService.batchUpdate(requestContext,
				salerOrders));
	}


}
