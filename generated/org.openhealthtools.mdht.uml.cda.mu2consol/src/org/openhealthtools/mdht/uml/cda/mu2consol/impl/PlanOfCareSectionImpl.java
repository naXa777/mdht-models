/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PlanOfCareSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Plan Of Care Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl
		implements PlanOfCareSection {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected PlanOfCareSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EList<PlanOfCareActivityAct> getMu2consolPlanOfCareActivityActs() {
    return PlanOfCareSectionOperations.getMu2consolPlanOfCareActivityActs(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EList<PlanOfCareActivityEncounter> getMu2consolPlanOfCareActivityEncounters() {
    return PlanOfCareSectionOperations.getMu2consolPlanOfCareActivityEncounters(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EList<PlanOfCareActivityObservation> getMu2consolPlanOfCareActivityObservations() {
    return PlanOfCareSectionOperations.getMu2consolPlanOfCareActivityObservations(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public PlanOfCareSection init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PlanOfCareSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlanOfCareSectionImpl
