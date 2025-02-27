package pt.lasige.inputmethod.metrics.data;

import java.util.ArrayList;

import pt.lasige.inputmethod.logger.Logger;
import pt.lasige.inputmethod.metrics.textentry.datastructures.Input;
import pt.lasige.inputmethod.metrics.textentry.datastructures.Tuple;

public class TimeOutsidePhrase {
    public TimeOutsidePhrase() {
        super();
    }

    public ArrayList<Long> execute(Logger logger){

        ArrayList<Long> res = logger.getTimeOutsideCurrentPhrase();

        if(logger.getOutPhraseTS() != -1){
            res.add(System.currentTimeMillis() - logger.getOutPhraseTS());
        }

        return res;
    }
}
