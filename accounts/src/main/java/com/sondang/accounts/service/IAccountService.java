package com.sondang.accounts.service;

import com.sondang.accounts.dto.CustomerDTO;

public interface IAccountService {

    /**
     *
     * @param customerDTO
     */
    void createAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber
     * @return Account Details based on a given mobileNumber
     */
    CustomerDTO fetchAccount(String mobileNumber);


    /**
     *
     * @param customerDTO
     * @return boolean indicating if the update of Account Details is successful or not
     */
    boolean updateAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the delete of Account Details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
