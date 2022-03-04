import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
    // Signal 자체는 기존에 구현되어 있다.
    // 
    List<Signal> calculateHandshake(int number) {
        List<Signal> actions = new ArrayList<>();
        if(( number & 1 << 0 ) != 0) {actions.add(Signal.WINK);}
        if(( number & 1 << 1 ) != 0) {actions.add(Signal.DOUBLE_BLINK);}
        if(( number & 1 << 2 ) != 0) {actions.add(Signal.CLOSE_YOUR_EYES);}
        if(( number & 1 << 3 ) != 0) {actions.add(Signal.JUMP);}
        if(( number & 1 << 4 ) != 0) {Collections.reverse(actions);}
        return actions;
    }
}
