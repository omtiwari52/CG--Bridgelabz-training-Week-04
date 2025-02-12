package com.capgemini.queue_interface.hospital_triage_system;

public class Patient {
    public String name;
    public int severity;

    public Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString(){
        return name + " Severity level -> " + severity;
    }

}
