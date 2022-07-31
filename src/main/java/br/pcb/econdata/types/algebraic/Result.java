package br.pcb.econdata.types.algebraic;

import br.pcb.econdata.types.algebraic.Result.Err;
import br.pcb.econdata.types.algebraic.Result.Ok;

public sealed interface Result<R> permits Ok, Err {

    public record Ok<R>(R result) implements Result<R> {};
    public record Err<R>(Throwable err) implements Result<R> {};
}
