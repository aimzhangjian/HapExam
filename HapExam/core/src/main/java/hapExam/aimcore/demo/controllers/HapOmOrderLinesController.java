package hapExam.aimcore.demo.controllers;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;
import hapExam.aimcore.demo.dto.HapOmOrderLines;
import hapExam.aimcore.demo.dto.SalerOrder;
import hapExam.aimcore.demo.service.HapArCustomersService;
import hapExam.aimcore.demo.service.HapInvInventoryItemsService;
import hapExam.aimcore.demo.service.HapOmOrderHeadersService;
import hapExam.aimcore.demo.service.HapOmOrderLinesService;
import hapExam.aimcore.demo.service.SalerOrderService;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 */
@Controller
@Scope("prototype")
public class HapOmOrderLinesController  extends BaseController{

    @Autowired
    private HapOmOrderLinesService hapOmOrderLinesService;

    @RequestMapping("/hapOmOrderLines/query")
    @ResponseBody
    public ResponseData selectList(HttpServletRequest request, HapOmOrderLines condition,
                                   @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                   @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        IRequest iRequest = createRequestContext(request);
        List<HapOmOrderLines> datas = hapOmOrderLinesService.selectHapOmOrderLinesList(iRequest, condition, page, pagesize);
        return new ResponseData(datas);
    }

   /* @RequestMapping(value = "/demo/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<Demo> demos) {
        IRequest iRequest = createRequestContext(request);
        List<Demo> datas = demoService.batchUpdate(iRequest, demos);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/demo/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<Demo> demos) {
        IRequest iRequest = createRequestContext(request);
        demoService.batchDelete(demos);
        return new ResponseData();
    }*/
}
