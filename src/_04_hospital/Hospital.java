package _04_hospital;

import java.util.ArrayList;

class Doctor{
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient d) throws DoctorFullException {
		if(patients.size() < 3) {
			patients.add(d);
		}else {
			throw new DoctorFullException();
		}
	}
	public ArrayList getPatients(){
		return patients;
	}
	public void doMedicine() {
		for(Patient p : patients) {
			p.checkPulse();
		}
	}
}

class GeneralPractitioner extends Doctor{
	public boolean makesHouseCalls() {
		return true;
	}
}

class Surgeon extends Doctor{
	public boolean performsSurgery() {
		return true;
	}
}

class Patient{
	boolean isCaredFor = false;
	public boolean feelsCaredFor() {
		return isCaredFor;
	}
	public void checkPulse(){
		isCaredFor = true;
	}
}

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}
	public ArrayList getDoctors(){
		return doctorList;
	}
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	public void addPatient(Patient d) {
		patientList.add(d);
	}
	public ArrayList getPatients(){
		return patientList;
	}
	public void assignPatientsToDoctors(){
		int j = 0;
		for(int i = 0; i < patientList.size(); i++) {
			
			try {
				doctorList.get(j).assignPatient(patientList.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i % 3 == 2) {
				j++;
			}
		}
	}
}
