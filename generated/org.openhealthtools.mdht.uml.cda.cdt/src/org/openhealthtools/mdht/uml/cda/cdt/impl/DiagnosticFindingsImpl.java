/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultsSectionImpl;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.operations.DiagnosticFindingsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Findings</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiagnosticFindingsImpl extends ResultsSectionImpl implements DiagnosticFindings {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticFindingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.DIAGNOSTIC_FINDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticFindingsOperations.validateResultsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticFindings init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticFindings init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DiagnosticFindingsImpl
