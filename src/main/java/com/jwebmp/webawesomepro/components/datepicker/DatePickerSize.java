package com.jwebmp.webawesomepro.components.datepicker;

/**
 * Size options for {@code <wa-date-picker>}.
 * <p>
 * Both the shorthand ({@code xs}, {@code s}, {@code m}, {@code l}, {@code xl}) and the long forms
 * ({@code small}, {@code medium}, {@code large}) are valid. Default is {@code m}.
 */
public enum DatePickerSize
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

    DatePickerSize(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

