/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ea.hr.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
public class TestAction {
    @RequestMapping(value="/test.jspa")
    @ResponseBody
    public String test(){
    System.out.println(123123);
    return "it works!";
    }
}
