package anobissexto;

/**
 *
 * @author Tat
 */
public class AnoBissexto {

    public boolean AnoBissexto(int ano) {
        if(ano> 0 && ano%4 ==0 && ano%100 != 0 || ano%400 == 0)
            return true;
                    else
            return false;
    }

}
