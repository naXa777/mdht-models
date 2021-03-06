/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientLocationInVehicleOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Location In Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientLocationInVehicleImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PatientLocationInVehicle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientLocationInVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientLocationInVehicle init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientLocationInVehicleImpl
