package xworkz.Friday;


import xworkz.Assign.Personnel;

public class Security {
    String securityType;
    int securityLevel;
    int personnelCount;
    String agency;

    Security(String securityType, int securityLevel, int personnelCount, String agency) {
        this.securityType = securityType;
        this.securityLevel = securityLevel;
        this.personnelCount = personnelCount;
        this.agency = agency;
    }

    public Security(Personnel[] personnels) {
    }

    void display() {
        System.out.println("Security: " + securityType + ", Level: " + securityLevel + ", Personnel: " + personnelCount + ", Agency: " + agency);
    }
}
