package pt.lasige.inputmethod.metrics.data;

import android.util.Log;

import pt.lasige.inputmethod.logger.Logger;
import pt.lasige.inputmethod.metrics.textentry.datastructures.Input;
import pt.lasige.inputmethod.metrics.textentry.datastructures.Tuple;

public class ActionCount {
    public ActionCount() {
        super();
    }

    public int execute(Logger logger){
        int count = 0, ins = 0, del = 0, sbs = 0, spc = 0;
        for (Tuple t: logger.getActions()){
            if((int) t.t1 == Input.ACTION_INSERT){
                ins++;
            }
            if((int) t.t1 == Input.ACTION_DELETE) {
                del++;
            }
            if((int) t.t1 == Input.ACTION_SUBSTITUTION) {
                sbs++;
            }
            if((int) t.t1 == Input.ACTION_SPACE) {
                spc++;
            }
            if((int) t.t1 == Input.ACTION_INSERT || (int) t.t1 == Input.ACTION_SPACE || (int) t.t1 == Input.ACTION_DELETE || (int) t.t1 == Input.ACTION_SUBSTITUTION)
                count++;
        }
        return count;
    }
}
