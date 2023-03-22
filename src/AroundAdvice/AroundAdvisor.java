package AroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obj ;
		
		System.out.println("Before Business Logic.");
		
		obj=mi.proceed();
		
		System.out.println("After Business Logic.");
		
		return obj;
	}

}
