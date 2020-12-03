package tdd;

/**
 * @author korayincki
 *
 */
public class CalcParameterResolver implements ParameterResolver{
	@Override
	public boolean supportsParameter(ParameterContext parameterContext, 
			ExtensionContext extensionContext) throws ParameterResolutionException {
				return parameterContext.getParameter().getType() == Calculator.class;
		
	}

	@Override
	public Object resolveParameter(ParameterContext arg0, ExtensionContext arg1) throws ParameterResolutionException {
		return new Calculator();
	}
}