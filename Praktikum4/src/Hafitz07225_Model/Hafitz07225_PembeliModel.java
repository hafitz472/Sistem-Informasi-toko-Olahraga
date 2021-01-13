
package Hafitz07225_Model;
import Hafitz07225_Entity.Hafitz07225_PembeliEntity;
import java.util.ArrayList;
public class Hafitz07225_PembeliModel implements Hafitz07225_ModelInterfaces{
    private ArrayList<Hafitz07225_PembeliEntity> PembeliEntityArrayList;
    
    public Hafitz07225_PembeliModel(){
        PembeliEntityArrayList = new ArrayList<Hafitz07225_PembeliEntity>();
    }
    public void insert(Hafitz07225_PembeliEntity pembeliEntity){
        PembeliEntityArrayList.add(pembeliEntity);
    }
    public int size(){
        return PembeliEntityArrayList.size();
    }
    public void remove(int index){
        PembeliEntityArrayList.remove(index);
    }

    public ArrayList<Hafitz07225_PembeliEntity>pembeliEntity(){
        return PembeliEntityArrayList;
    }
    @Override
    public int cekData(String nomor, String password){
        int loop = 0;
        while(!PembeliEntityArrayList.get(loop).getNomor().equals(nomor)&&!PembeliEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public Hafitz07225_PembeliEntity showdatapembeli(int index){
        return PembeliEntityArrayList.get(index);
    }
}
