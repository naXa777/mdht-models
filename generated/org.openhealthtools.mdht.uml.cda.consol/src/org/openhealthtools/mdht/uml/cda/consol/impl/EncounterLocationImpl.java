/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterLocation;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterLocationOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterLocationImpl extends Participant2Impl implements EncounterLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTER_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCodeVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasPlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasPlayingEntityPlace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasPlayingEntityPlace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EncounterLocationImpl
