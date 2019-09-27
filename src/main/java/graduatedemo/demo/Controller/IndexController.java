package graduatedemo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/*登录页面、首页*/
@Controller

public class IndexController {

    /*登录页面
    *
    * */
  @RequestMapping("/")
  public String toindex(){

      return "login";
  }
    /*登录入口
    *
    * */
    @RequestMapping("/login.json")
    @ResponseBody
    public Map recieveData(@RequestBody Map<String,Object> loginData){
        Map<String,Object> map = new HashMap<>();
        String loginName = loginData.get("loginName").toString();
        System.out.println("...controller");
        return map;

    }
  /* 主页
   * @param request
   * */
   @RequestMapping({"index.html"})
    public String index(){
       return "index";
   }
}
