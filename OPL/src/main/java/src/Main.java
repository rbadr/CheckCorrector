package src;

import java.util.Iterator;

import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtField;
import spoon.reflect.factory.Factory;

public class Main {
	public static void main(String[] args) {
		Factory factory=new Launcher().createFactory();
		final CtClass<?> test=(CtClass<?>) factory.Type().get(Test.class);
		Iterator<CtField<?>> methods=test.getFields().iterator();
		while (methods.hasNext()){
			CtField<?> method=methods.next();
			System.out.println(method);
		}
		factory.Eval();
		
	}
}
