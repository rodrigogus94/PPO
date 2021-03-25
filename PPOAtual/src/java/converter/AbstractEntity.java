/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.io.Serializable;

/**
 *
 * @author Alana Tenório
 */
public abstract class AbstractEntity implements Serializable {

    private Integer codigoC;

    public Integer getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(Integer codigoC) {
        this.codigoC = codigoC;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoC == null) ? 0 : codigoC.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractEntity other = (AbstractEntity) obj;
        if (codigoC == null) {
            if (other.codigoC != null) {
                return false;
            }
        } else if (!codigoC.equals(other.codigoC)) {
            return false;
        }
        return true;
    }
}
