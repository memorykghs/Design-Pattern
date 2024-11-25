package interfaceSegregation;

/**
 * @author memorykghs
 * @date 2024/11/14
 */
public class ProviderA implements CreditCardPay, QRCodePay{

    @Override
    public void payWithCreditCard() {

    }

    @Override
    public void payWithQRCode() {

    }
}
