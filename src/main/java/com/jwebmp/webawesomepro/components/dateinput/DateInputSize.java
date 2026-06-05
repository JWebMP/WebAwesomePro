package com.jwebmp.webawesomepro.components.dateinput;

/**
 * Size options for {@code <wa-date-input>}.
 * <p>
 * Both the shorthand ({@code xs}, {@code s}, {@code m}, {@code l}, {@code xl}) and the long forms
 * ({@code small}, {@code medium}, {@code large}) are valid. Default is {@code m}.
 */
public enum DateInputSize
{
    Xs("xs"),
    S("s"),
    M("m"),
    L("l"),
    Xl("xl"),
    Small("small"),
    Medium("medium"),
    Large("large");

    private final String value;

    DateInputSize(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

