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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionEntryOperations;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConditionEntryImpl extends ProblemEntryImpl implements ConditionEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.CONDITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasOnsetDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasUnknownResolutionDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getHITSPAgeObservation() {
		return ConditionEntryOperations.getHITSPAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getHITSPProblemStatusObservation() {
		return ConditionEntryOperations.getHITSPProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemEntryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateProblemEntryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemEntryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateProblemEntryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemEntryProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionEntryOperations.validateProblemEntryProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionEntry init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionEntry init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // ConditionEntryImpl
