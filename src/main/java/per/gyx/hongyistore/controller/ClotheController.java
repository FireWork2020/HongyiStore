package per.gyx.hongyistore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.gyx.hongyistore.common.Result;
import per.gyx.hongyistore.common.ResultGenerator;
import per.gyx.hongyistore.service.ClotheService;

@RestController
@RequestMapping("/goods/clothe")
public class ClotheController {

    @Autowired
    private ClotheService clotheService;
    @GetMapping("/recommend")
    public Result getRecommendClothe(){
        return ResultGenerator.genSuccessResult(clotheService.getRecommendOrLikeClothe(1));
    }

}
