package com.wangjzh.exception;


import com.wangjzh.dto.ErrorInfo;
import com.wangjzh.util.ToWeb;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @description 全局异常处理，捕获所有Controller中抛出的异常。
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-7 00:45:09
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	//处理自定义的异常
	@ExceptionHandler(value = BaseException.class)
	@ResponseBody
	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, BaseException e) throws Exception {
		ErrorInfo<String> r = new ErrorInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(ErrorInfo.ERROR);
		r.setData("Some Data");
		r.setUrl(req.getRequestURL().toString());
		return r;
	}


	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ErrorInfo<String> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		ErrorInfo<String> r = new ErrorInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(ErrorInfo.ERROR);
		r.setData("Some Data");
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
