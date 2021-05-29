package com.dicoding.picodiploma.aurisproject.utils

import com.dicoding.picodiploma.aurisproject.R

object DataDummy {

    fun generateDummyAlphabet(): List<DataDictionary>{

        val alphabet = ArrayList<DataDictionary>()

        alphabet.add(DataDictionary("A",
            R.drawable.a))
        alphabet.add(DataDictionary("B",
            R.drawable.b))
        alphabet.add(DataDictionary("C",
            R.drawable.c))
        alphabet.add(DataDictionary("D",
            R.drawable.d))
        alphabet.add(DataDictionary("E",
            R.drawable.e))
        alphabet.add(DataDictionary("F",
            R.drawable.f))
        alphabet.add(DataDictionary("G",
            R.drawable.g))
        alphabet.add(DataDictionary("H",
            R.drawable.h))
        alphabet.add(DataDictionary("I",
            R.drawable.i))
        alphabet.add(DataDictionary("J",
            R.drawable.j))
        alphabet.add(DataDictionary("K",
            R.drawable.k))
        alphabet.add(DataDictionary("L",
            R.drawable.l))
        alphabet.add(DataDictionary("M",
            R.drawable.m))
        alphabet.add(DataDictionary("N",
            R.drawable.n))
        alphabet.add(DataDictionary("O",
            R.drawable.o))
        alphabet.add(DataDictionary("P",
            R.drawable.p))
        alphabet.add(DataDictionary("Q",
            R.drawable.q))
        alphabet.add(DataDictionary("R",
            R.drawable.r))
        alphabet.add(DataDictionary("S",
            R.drawable.s))
        alphabet.add(DataDictionary("T",
            R.drawable.t))
        alphabet.add(DataDictionary("U",
            R.drawable.u))
        alphabet.add(DataDictionary("V",
            R.drawable.v))
        alphabet.add(DataDictionary("W",
            R.drawable.w))
        alphabet.add(DataDictionary("X",
            R.drawable.x))
        alphabet.add(DataDictionary("Y",
            R.drawable.y))
        alphabet.add(DataDictionary("Z",
            R.drawable.z))

        return alphabet
    }

    fun generateDummyNumber(): List<DataDictionary>{
        val number = ArrayList<DataDictionary>()

        number.add(DataDictionary("0",
            R.drawable.a))
        number.add(DataDictionary("1",
            R.drawable.b))
        number.add(DataDictionary("2",
            R.drawable.c))
        number.add(DataDictionary("3",
            R.drawable.d))
        number.add(DataDictionary("4",
            R.drawable.e))
        number.add(DataDictionary("5",
            R.drawable.f))
        number.add(DataDictionary("6",
            R.drawable.g))
        number.add(DataDictionary("7",
            R.drawable.h))
        number.add(DataDictionary("8",
            R.drawable.i))
        number.add(DataDictionary("9",
            R.drawable.j))

        return number
    }
}