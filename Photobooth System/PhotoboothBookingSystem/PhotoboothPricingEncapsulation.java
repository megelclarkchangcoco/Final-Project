package PhotoboothBookingSystem;

import java.util.HashMap;

public class PhotoboothPricingEncapsulation {
    private HashMap<String, Double> design = new HashMap<>();
    private HashMap<String, Double> designts = new HashMap<>();
    private HashMap<String, Double> designdedication = new HashMap<>();
    private HashMap<String, Double> designpolaroid = new HashMap<>();
    private Double magnetic = 500.0;
    private Double ownLayout = 2500.0;
    private Double magneticTs = 1000.0;
    private Double ownLayoutTs = 2800.0;
    private Double ownLayoutDedication = 3000.0;
    private Double magneticpolaroid = 1000.0;
    private Double ownLayoutpolaroid = 2800.0;
    private Double thirtymins = 500.0;
    private Double onehour = 1000.0;
    		

    public PhotoboothPricingEncapsulation() {
    	design.put("Choose 4R/Standard Layout Design", 0.0);
        design.put("1. Disney Princess (Arial)", 2500.0);
        design.put("2. Butterfly", 2500.0);
        design.put("3. Wreck it ralph (Vanellope)", 2500.0);
        design.put("4. Flower Roses", 2500.0);
        design.put("5. BTS", 2500.0);
        design.put("6. Barbie", 2500.0);
        design.put("7. Frozen", 2500.0);
        design.put("8. Encanto", 2500.0);
        design.put("9. Jungle", 2500.0);
        design.put("10. Flower (2)", 2500.0);
        design.put("11. Racing", 2500.0);
        design.put("12. Disney Princess (Arial2)", 2500.0);
        design.put("13. SuperDad", 2500.0);
        design.put("14. Ligthing Mcqueen", 2500.0);
        design.put("15. Mickey Mouse", 2500.0);
        design.put("16. Disney Princess (Cinderella)", 2500.0);
        design.put("17. Umbrella", 2500.0);
        design.put("18. 80's", 2500.0);
        design.put("19. Unicorn", 2500.0);
        design.put("20. Smurf", 2500.0);
        design.put("21. Babyshark", 2500.0);
        
        designts.put("Choose 4R/Standard Layout Design", 0.0);
        designts.put("1. Disney Princess (Arial)", 2800.0);
        designts.put("2. Butterfly", 2800.0);
        designts.put("3. Wreck it ralph (Vanellope)", 2800.0);
        designts.put("4. Flower Roses", 2800.0);
        designts.put("5. BTS", 2800.0);
        designts.put("6. Barbie", 2800.0);
        designts.put("7. Frozen", 2800.0);
        designts.put("8. Encanto", 2800.0);
        designts.put("9. Jungle", 2800.0);
        designts.put("10. Flower (2)", 2800.0);
        
        designdedication.put("Choose 4R/Standard Layout Design", 0.0);
        designdedication.put("1. Disney Princess (Arial)", 3000.0);
        designdedication.put("2. Butterfly", 3000.0);
        designdedication.put("3. Wreck it ralph (Vanellope)", 3000.0);
        designdedication.put("4. Flower Roses", 2800.0);
        designdedication.put("5. BTS", 3000.0);
        designdedication.put("6. Barbie", 3000.0);
        designdedication.put("7. Frozen", 3000.0);
        designdedication.put("8. Encanto", 3000.0);
        designdedication.put("9. Jungle", 3000.0);
        designdedication.put("10. Flower (2)", 3000.0);
        
        designpolaroid.put("Choose Polaroid Layout Size", 0.0);
        designpolaroid.put("1. Polaroid Height(4.1) Width(4.1)", 2800.0);
        designpolaroid.put("2. Polaroid Height(3.3) Width(4.5)", 2800.0);
    }

    public PhotoboothPricingEncapsulation(Double magnetic,Double ownLayout, Double ownLayoutTs, Double magneticTs, Double ownLayoutDedication, Double magneticpolaroid, Double ownLayoutpolaroid, Double thirtymins, Double onehour) {
        this.magnetic = magnetic;
        this.ownLayout = ownLayout;
        this.ownLayoutTs = ownLayoutTs;
        this.magneticTs = magneticTs;
        this.ownLayoutDedication = ownLayoutDedication;
        this.magneticpolaroid = magneticpolaroid;
        this.ownLayoutpolaroid = ownLayoutpolaroid;
        this.thirtymins = thirtymins;
        this.onehour = onehour;
    }
   

    public double calculatePackageStandard(String designPrice, String magneticPrice, String thirtyminsPrice, String onehourPrice) {
    	 double designCost = design.getOrDefault(designPrice, 0.0);		// design price
         double magneticCost = magneticPrice != null ? magnetic : 0.0; // magnetic cost
         double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
         double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
         return designCost + magneticCost + thirtyminsCost + onehourCost;
    }
    
    public double calculatePackageStandard2(String ownLayoutPrice, String magneticPrice, String thirtyminsPrice, String onehourPrice) {
        double magneticCost = magneticPrice != null ? magnetic : 0.0;
        double ownlayoutCost = ownLayout != null ? ownLayout : 0.0;
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return ownlayoutCost + magneticCost + thirtyminsCost + onehourCost;
    }

    
    public double calculatePackageTwinstrip(String designPriceTs, String magneticSelected2, String thirtyminsPrice, String onehourPrice) {
        double designCostTs = designts.getOrDefault(designPriceTs, 0.0); // design cost
        double magneticCostTs = magneticSelected2 != null ? magneticTs : 0.0;// magnetic cost
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return designCostTs + magneticCostTs + thirtyminsCost + onehourCost;
    }

    public double calculatePackageTwinstrip2(String ownLayoutSelected2, String magneticSelected2, String thirtyminsPrice, String onehourPrice) {
    	double magneticCostTs = magneticSelected2 != null ? magneticTs : 0.0; // magnetic cost
        double ownLayoutCostTs = ownLayoutSelected2 != null ? ownLayoutTs : 0.0;// own design cost
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return ownLayoutCostTs + magneticCostTs + thirtyminsCost + onehourCost;
    }
    
    public double calculatePackageDedication(String designPriceDedication, String magneticSelected, String thirtyminsPrice, String onehourPrice) {
        double designCostDedication = designdedication.getOrDefault(designPriceDedication, 0.0);
        double magneticCostdedication = magneticSelected != null ? magnetic : 0.0;
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return designCostDedication + magneticCostdedication + thirtyminsCost + onehourCost;
    }

    public double calculatePackageDedication2(String ownLayoutSelected, String magneticSelected, String thirtyminsPrice, String onehourPrice) {
        double magneticCostdedication = magneticSelected != null ? magnetic : 0.0;
        double ownLayoutCostDedication = ownLayoutSelected != null ? ownLayoutDedication : 0.0;
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return ownLayoutCostDedication + magneticCostdedication + thirtyminsCost + onehourCost;
    }
    
    public double calculatePackagePolaroid(String designPricePolaroid, String  magneticSelected, String thirtyminsPrice, String onehourPrice) {
        double designCostPolaroid = designpolaroid.getOrDefault(designPricePolaroid, 0.0);
        double magneticCostPolaroid = magneticSelected != null ? magneticpolaroid  : 0.0;
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return designCostPolaroid + magneticCostPolaroid  + thirtyminsCost + onehourCost;
    }

    public double calculatePackagePolaroid2(String ownLayoutSelected, String magneticSelected, String thirtyminsPrice, String onehourPrice) {
        double magneticCostPolaroid = magneticSelected != null ? magneticpolaroid  : 0.0;
        double ownLayoutCostPolaroid = ownLayoutSelected != null ? ownLayoutpolaroid  : 0.0;
        double thirtyminsCost = thirtyminsPrice != null ? thirtymins : 0.0; // extend 30 mins
        double onehourCost = onehourPrice != null ? onehour : 0.0; // extend 1 hour cost
        return ownLayoutCostPolaroid + magneticCostPolaroid  + thirtyminsCost + onehourCost;
    }
}

