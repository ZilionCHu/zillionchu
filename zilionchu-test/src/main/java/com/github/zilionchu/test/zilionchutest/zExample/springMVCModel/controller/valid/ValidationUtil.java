package com.github.zilionchu.test.zilionchutest.zExample.springMVCModel.controller.valid;

import com.github.zilionchu.test.zilionchutest.guava.event.Response;
import org.springframework.validation.BindingResult;

/**
 * 校验工具类
 *
 * @Author ZLlionCHu
 * @ create 2018/11/16
 */
public class ValidationUtil {
    public static void validateDto(Response response, BindingResult bindingResult) {
//        response.setMsg(null);
//        String errMsg = bindingResult.getAllErrors().stream()
//                .map(e -> (FieldError) e)
//                .map(FieldError::getDefaultMessage)
//                .reduce((a, b) -> String.join(";", a, b))
//                .orElse(StringUtils.EMPTY);
//
//        if ((StringUtils.isNotEmpty(errMsg))) {
//            response.setCode(ResponseMessageEnum.RESPONSE_BAD_REQUEST.getCode());
//            response.setMsg(errMsg);
//        }
    }
}
