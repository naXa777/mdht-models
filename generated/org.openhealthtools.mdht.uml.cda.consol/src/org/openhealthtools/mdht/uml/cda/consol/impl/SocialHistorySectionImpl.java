/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionImpl extends SectionImpl implements SocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionMaritalStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionMaritalStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionReligiousAffiliation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionReligiousAffiliation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionPatientRace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientRace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionPatientRaceCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientRaceCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionPatientEthnicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionPatientEthnicityCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicityCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySectionSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionSocialHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialHistory> getSocialHistories() {
		return SocialHistorySectionOperations.getSocialHistories(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SocialHistorySectionImpl
