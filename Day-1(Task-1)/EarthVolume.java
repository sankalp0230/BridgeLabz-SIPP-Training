public class EarthVolume{
    public static void main(String[] args) {
        int RadiusinKm=6378;
        double volume = (4.0/3.0)*Math.PI*RadiusinKm*RadiusinKm*RadiusinKm;
        System.out.println("The volume of the Earth is: "+volume+" cubic kilometers");
        double RadiusinMiles =RadiusinKm * 0.621371 ;
        double volumeInMiles = (4.0/3.0)*Math.PI*RadiusinMiles*RadiusinMiles*RadiusinMiles;
        System.out.println("The Volume of the Earth in miles is: "+volumeInMiles+" cubic miles");
        
    }
}