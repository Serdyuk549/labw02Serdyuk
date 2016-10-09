/**
 * Created by Максим on 09.10.2016.
 */
public class vagon2 extends vagon {
    public void IzmenitxChisloMest (int NovoeChisloMest) {
        ChisloMest=NovoeChisloMest;
    }
    public void ZanyatxMesto (int NomerMesta) {
        if (MestoZanyato(NomerMesta)==1)
        {
            System.out.println("Mesto zanyato!");
            System.out.println("Nomer vagona - "+NomerEtogoVagona+" ,nomer mesta - "+NomerMesta);
        }
        else {
            Mesta[NomerMesta-1]=1;
        }
    }
    public void VagonInfo() {
        int k=0;
        System.out.println("Nomer vagona -"+NomerEtogoVagona);
        for (int i=0; i<Mesta.length; i++)
            if (Mesta[i]==0) k++;
        System.out.println("Kolichestvo svobodnyh mest - "+k);
        super.VagonInfo();
    }
}
