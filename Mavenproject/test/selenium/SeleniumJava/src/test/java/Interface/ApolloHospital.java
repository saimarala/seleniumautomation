package Interface;

public class ApolloHospital extends GlobalPatientData implements USMedical,UKMedical,IndianMedical{

    //if a class is  implements any interface ,then its mandatory to define/override all the methods
    @Override
    public void physioServicess() {
        System.out.println("AP-physo");
    }

    @Override
    public void oncologyServices() {
        System.out.println("AP-oncology");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("AP-ortho");
    }

    @Override
    public void RadiologyService() {
        System.out.println("RadiologyServices");
    }

    @Override
    public void ENTServices() {
        System.out.println("AP-ENT");
    }

    @Override
    public void ambulanceServices() {
        System.out.println("AP-ambulance");
    }

    @Override
    public void emergencyServices() {
        System.out.println("AP-emergency");
    }

    @Override
    public void neroServices() {
        System.out.println("AP-neuro");
    }

    @Override
    public void peditricServices() {
        System.out.println("AP-peditric");
    }

    @Override
    public void polioServices() {
        System.out.println("polio services");
    }
}
