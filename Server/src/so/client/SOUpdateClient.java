/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.client;

import db.DBBroker;
import domain.AbstractDomainObject;
import domain.Account;
import domain.Client;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Ana
 */
public class SOUpdateClient extends AbstractSO {

    @Override
    protected void validate(AbstractDomainObject ado) throws Exception {
        if (!(ado instanceof Client)) {
            throw new Exception("The forwarded object is not an instance of the class Client!");
        }



    }

    @Override
    protected void execute(AbstractDomainObject ado) throws SQLException {
        DBBroker.getInstance().update(ado);
        
      
        
    }

}
