/**
 * Local record can be defined as below
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class LocalRecord {
    List<Merchant> findTopMerchants(List<Merchant> merchants, int month) {
        // Local record
        record MerchantSales(Merchant merchant, double sales) {
        }

        return merchants.stream()
                .map(merchant -> new MerchantSales(merchant, month))
                .sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales()))
                .map(MerchantSales::merchant)
                .collect(toList());
    }
}

record Merchant(double sales) {
};
