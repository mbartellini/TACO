/*
 * TACO: Translation of Annotated COde
 * Copyright (c) 2010 Universidad de Buenos Aires
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA,
 * 02110-1301, USA
 */
package ar.edu.taco.simplejml.methodinfo;

import org.multijava.mjc.CStdType;

import ar.edu.taco.TacoException;

/**
 * @author elgaby
 *
 */
public class MI_JavaLangString implements MethodInformationSupplier {

	/* (non-Javadoc)
	 * @see ar.edu.taco.pipeline.javatodynjalloy.methodinfo.MethodInformationSupplier#getInformationForMethod(java.lang.String)
	 */
	@Override
	public ConcreteMethodInformation getInformationForMethod(String methodName) {
		ConcreteMethodInformation concreteMethodInformation = new ConcreteMethodInformation();
		if ("valueOf".equals(methodName)) {
			concreteMethodInformation.setConstructor(false);
			concreteMethodInformation.setStatic(true);
			concreteMethodInformation.setModelMethod(false);
			concreteMethodInformation.setReturnType(CStdType.String);
			concreteMethodInformation.setQualifiedReceiverType("java_lang_String");
		} else if ("buildInstance".equals(methodName)) {
				concreteMethodInformation.setConstructor(false);
				concreteMethodInformation.setStatic(true);
				concreteMethodInformation.setModelMethod(false);
				concreteMethodInformation.setReturnType(CStdType.String);
				concreteMethodInformation.setQualifiedReceiverType("java_lang_String");
		} else {
			throw new TacoException("Method: " + methodName + "wasn't found.");
		}
		
		return concreteMethodInformation;
	}

}
