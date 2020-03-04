package per.gyx.hongyistore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.gyx.hongyistore.common.Result;
import per.gyx.hongyistore.common.ResultGenerator;
import per.gyx.hongyistore.service.ClotheService;

import java.util.Map;

@RestController
@RequestMapping("/goods")
public class ClotheController {

    @Autowired
    private ClotheService clotheService;
    @GetMapping("/recommend")
    public Result getRecommendClothe(@RequestBody Integer id){
        return ResultGenerator.genSuccessResult(clotheService.getRecommendOrLikeClothe(1));
    }
    @GetMapping("/goodsByParentMenu")
    public Result get(@RequestParam("menuId") Integer id){
        System.out.println(id);
        return ResultGenerator.genSuccessResult();
    }

}
