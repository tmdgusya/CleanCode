class PayRoll 

    module type
        COMMISSIONED = "COMMISSIONED"
        HOURLY = "HOURLY"
        SALARIED = "SALARIED"
    end

    module Payment
        COMISSION_PAY = 10000
        HOURLY_PAY = 8000
        SALARIED_PAY = 12000
    end

    def public calculate_pay(employee)
        case employee.type 
        when COMMISSIONED then return calculateCommissionedPay(employee)
        when HOURLY then calculateHourlyPay(employee)
        when SALARIED then calculateSalariedPay(employee)
        else raise RuntimeError.new("잘못된 타입입니다.")
        end
    end

    def calculateCommissionedPay(employee)
        # 커미션에 대한 가격을 계산하여 지급액을 계산하는 함수
        return COMISSION_PAY
    end

    def calculateHourlyPay(employee)
        # 시간에 대한 지급액을 계산하는 함수
        return HOURLY_PAY
    end

    def calculateSalariedPay(employee)
        # 월급을 계산하는 함수
        return SALARIED_PAY
    end

end