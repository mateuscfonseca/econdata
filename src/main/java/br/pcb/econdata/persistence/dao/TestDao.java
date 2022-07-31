package br.pcb.econdata.persistence.dao;

import br.pcb.econdata.types.algebraic.Result;

public class TestDao {

    public Result<String> test(){
        return new Result.Ok<>("oi");
    }
    
}
