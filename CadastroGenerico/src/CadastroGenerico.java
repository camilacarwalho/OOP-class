import java.util.Arrays;

public class CadastroGenerico <T>{
    private T[] objetos;
    private int quant;

    public CadastroGenerico(){
        objetos = (T[]) new Object[100];
        quant = 0;
    }

    public boolean salvar (T objeto){
        if(quant<objetos.length>){
            objetos[quant++]=objeto;
            return true;
        }else{
            return false;
        }
    }

    public T[] listar (){
            return Arrays.copyOfRange(objetos.0,quant)
    }


    public boolean deletar(T obj){
        for (int i = 0; i<quant; i++){
            if (objetos[i].equals(obj)){
                for (int j=i;j<quant-1;j++){
                    objetos[j]=objetos[j+1];
                }
                quant--;
                return true;
            }
        }return false;
    }
}
