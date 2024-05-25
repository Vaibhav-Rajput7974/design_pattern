package com.example.design.patten.eCommercePlateform;

import com.example.design.patten.eCommercePlateform.ApplyDiscount;
import com.example.design.patten.eCommercePlateform.CheckoutCommand;
import com.example.design.patten.eCommercePlateform.CommonProduct;
import com.example.design.patten.eCommercePlateform.Expedited;
import com.example.design.patten.eCommercePlateform.ExtendedWarranties;
import com.example.design.patten.eCommercePlateform.GPay;
import com.example.design.patten.eCommercePlateform.GiftWrapping;
import com.example.design.patten.eCommercePlateform.International;
import com.example.design.patten.eCommercePlateform.Order;
import com.example.design.patten.eCommercePlateform.PaymentAdapter;
import com.example.design.patten.eCommercePlateform.PaymentProvider;
import com.example.design.patten.eCommercePlateform.PhonePay;
import com.example.design.patten.eCommercePlateform.Product;
import com.example.design.patten.eCommercePlateform.RemoveItem;
import com.example.design.patten.eCommercePlateform.Shipping;
import com.example.design.patten.eCommercePlateform.Shoping;
import com.example.design.patten.eCommercePlateform.Standard;
import com.example.design.patten.eCommercePlateform.UpdateQuantities;

public class ECommercePlatformMain {

    public static void main(){

        // Command pattern
        Order order = new Order();
        CheckoutCommand applyDiscountCommand = new ApplyDiscount(order);
        CheckoutCommand removeItemCommand = new RemoveItem(order);
        CheckoutCommand updateQuantities = new UpdateQuantities(order);
        Shoping shoping = new Shoping();
        shoping.setCheckoutCommand(applyDiscountCommand);
        shoping.execute();

        shoping.setCheckoutCommand(removeItemCommand);
        shoping.execute();

        shoping.setCheckoutCommand(updateQuantities);
        shoping.execute();

        // Decorator Pattern
        Product extendedWarrantiGiftWrappingOnCommonProduct = new ExtendedWarranties(new GiftWrapping(new CommonProduct()));

        Product extendedWarraties = new ExtendedWarranties(new CommonProduct());
        shoping.product(extendedWarraties);
        shoping.product(extendedWarrantiGiftWrappingOnCommonProduct);

        // Strategy Pattern
        Shipping expenditedShipping = new Expedited();
        Shipping standardShipping = new Standard();
        Shipping internationalShipping = new International();

        shoping.ship(expenditedShipping);
        shoping.ship(standardShipping);
        shoping.ship(internationalShipping);

        //Adapter Pattern
        PaymentProvider phonePay = new PhonePay();
        PaymentProvider gPay = new GPay();

        PaymentAdapter payWithPhonePay = new PaymentAdapter(phonePay);
        PaymentAdapter payWithGpay = new PaymentAdapter(gPay);

        shoping.pay(payWithGpay);
        shoping.pay(payWithPhonePay);

    }
}
