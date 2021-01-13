
package Hafitz07225_Model;
import Hafitz07225_Entity.Hafitz07225_PenjualEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Hafitz07225_PenjualModel implements Hafitz07225_ModelInterfaces{
    private ArrayList<Hafitz07225_PenjualEntity> penjualEntityArrayList;

public Hafitz07225_PenjualEntity showDataPenjual(int index){
    return penjualEntityArrayList.get(index);
}

    public ArrayList<Hafitz07225_PenjualEntity> penjualEntity() {
        return penjualEntityArrayList;
    }
    
public Hafitz07225_PenjualModel(){
    penjualEntityArrayList = new ArrayList<Hafitz07225_PenjualEntity>();
}
    public void insertPenjual(Hafitz07225_PenjualEntity penjual){
        penjualEntityArrayList.add(penjual);
    }

@Override
public int cekData(String nomor, String password){
    int loop = -1;
    for(int i=0; i<penjualEntity().size();i++){
        if(nomor.equals(penjualEntity().get(i).getNomor())&& password.equals(penjualEntity().get(i).getPassword())){
            loop = i;
        }
    }return loop;
}
}
