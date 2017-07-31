package anobissexto;

/**
 *
 * @author Tat
 */
public class AnoBissexto {

    public boolean AnoBissexto(int ano) {
        if(ano%4 ==0 || ano%400 == 0)
            return true;
                    else
            return false;
    }

}
