package Interface;

import org.testng.annotations.Test;

public class TestHospital {
    @Test
    void testHospital(){
        ApolloHospital ap=new ApolloHospital();
        ap.ambulanceServices();
        ap.emergencyServices();
        ap.oncologyServices();
        System.out.println(USMedical.min_fee);
        USMedical.Services_119();
        ap.interShip();
        ap.getPatientHistory();


        //topcasting
        USMedical us=new ApolloHospital();// child class object referred by the parent interface ref variable
        us.orthopedicServices();
        us.physioServicess();
        us.oncologyServices();
        us.interShip();


    }
}
