package types.linkedlist;

import util.adt.LinkNode;
import util.adt.LinkNodeRandom;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedListWithRandomPointer {

    public LinkNodeRandom cloneList(LinkNodeRandom head) {
        Map<LinkNodeRandom, LinkNodeRandom> map = new HashMap<>();
        LinkNodeRandom p = head;
        LinkNodeRandom rs = null;
        while(p != null) {
            map.put(p, new LinkNodeRandom(p.getData(), p.getNext(), p.getRandom()));
            if(rs == null) {
                rs = map.get(p);
            }
            p = p.getNext();
        }
        LinkNodeRandom pR = rs;
        while(pR != null) {
            pR.setNext(map.get(pR.getNext()));
            pR = pR.getNext();
        }
        pR = rs;
        while(pR != null) {
            pR.setRandom(map.get(pR.getRandom()));
            pR = pR.getNext();
        }
        return rs;
    }

}
