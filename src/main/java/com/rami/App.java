package com.rami;


import com.rami.vo.InvestmentType;
import com.rami.vo.InvestmentVO;

public class App
{
    public static void main( String[] args )
    {
        final InvestmentVO ibmStock = new InvestmentVO.Builder().name("IBM").stockExchange("NYSE")
                .currency("USD").InvestmentType(InvestmentType.STOCK).price(54.33).ticker("IBM")
                .build();

        System.out.println(ibmStock);

    }
}
