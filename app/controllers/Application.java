package controllers;

import models.Calculator;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	 static String var;
	static Form<Calculator> calForm = Form.form(Calculator.class);
	static String r="";
    public static Result index() {
    	return ok(index.render("fgfgfgfgfgfhg"));
    }
   
    public static Result sum() {
    	Calculator cc=calForm.bindFromRequest().get();
    	//Form<Calculator> filledForm = calForm.bindFromRequest();
   int t=cc.num1;
   int t2=cc.num2;
   int t3=cc.num3;
   double solv=Math.sqrt(t2*t2-4*t*t3);
  double x1=(-t2+solv)/(2*t);
  double x2=(-t2-solv)/(2*t);
   
   if(solv>=0)
	   var="x1"+x1+"  x2"+x2;
   else
	   var="impossible ";
  	   return redirect(routes.Application.index()); 
  	  
    }   
}
