package com.example.myjamaat_sp;

import java.util.ArrayList;
import java.util.List;

public class Storable {

    public static String encode(List<ModelMasjid> list){

        ArrayList<String> masjidListStrings = new ArrayList<>();
        String returnStorableString = "";

        for( ModelMasjid masjid: list){
            masjidListStrings.add(masjid.toStorableString());
        }
        for (String masjid: masjidListStrings){
            returnStorableString += masjid +"#";
        }

        return returnStorableString;
    }

    public static List<ModelMasjid> decode(String listString){

        List<ModelMasjid> returnMasjidList = new ArrayList<>();
        if(!listString.contains("#")){
            return  returnMasjidList;
        }
        try {
            String[] masjidListStrings = listString.split("#");
            String[] individual;
            for (String masjidString : masjidListStrings) {
                    individual = masjidString.split(",");
                    ModelMasjid newMasjid = new ModelMasjid(Integer.parseInt(individual[0]), individual[1], Boolean.parseBoolean(individual[2]),
                            individual[3], individual[4], individual[5], individual[6], individual[7]);
                    returnMasjidList.add(newMasjid);
                }
            }catch (Exception e){
            e.printStackTrace();
        }

        return returnMasjidList;
        }

}
