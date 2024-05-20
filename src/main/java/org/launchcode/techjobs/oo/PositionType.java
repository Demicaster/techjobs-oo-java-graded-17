package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {


    public PositionType() {
        super();

    }

    public PositionType(String value) {
        super(value);
    }



    @Override
    public boolean equals(Object o) {  // Just copied and pasted from Employer class and changed variables
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }


}
