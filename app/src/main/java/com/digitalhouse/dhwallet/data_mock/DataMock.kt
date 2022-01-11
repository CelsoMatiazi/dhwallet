package com.digitalhouse.dhwallet.data_mock

import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.ContactType
import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupType

class DataMock {

    fun dataFriends() : MutableList<Contact>{
        return mutableListOf(
            Contact(
                image = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/a/3/7/2/a372ee687749cef5ec6188750852ac96.jpg",
                name = "Jimi Hendrix",
                type = ContactType.AMIGO

            ),

            Contact(
                image = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBQUFBgUFBQYGRgZGBkYGRgYGBoaGBsZGBgZGxoYGhkbIS0kGx0qIRgZJTklKi4xNDQ0GiM6PzoyPi0zNDEBCwsLEA8QHxISHzMrIyszMzMzMzMzMzMzMzMzMzMzMzMzNTMzMzMzMzUzMzM1MzMzMzMzMzMzMzMzMzMzMzMzM//AABEIARMAtwMBIgACEQEDEQH/xAAcAAAABwEBAAAAAAAAAAAAAAAAAQIDBAUGBwj/xAA+EAACAQIEAwYDBgQGAQUAAAABAhEAAwQSITEFQVEGImFxgZETMqEHQlKxwdFicoLwFCMzkuHxshVDU6LS/8QAGgEAAgMBAQAAAAAAAAAAAAAAAgMAAQQFBv/EACoRAAMAAgEDAgUFAQEAAAAAAAABAgMRIQQSMUFREyIyYZEFFFJxgaEj/9oADAMBAAIRAxEAPwDjNChQqyAoUKFQgKFChUIHSkFJFPWlopKb4H7S1LtimLa1KQVohGPJQ/bFSra0xaFS0FaIRiyMeRakoKYSpCVokxWx5RSwKQtOgU1GeghTiigopQFWA2KFIalikvUAQyRRFaWRSYqDUxBWhSmoVNF7Oa0KFCvPnrwUKFCoQFChQqEFKKlWlpi2Kl2xTIQvI+B+2tSEWmkFSUFaZRitjyCpFumUFSEFPkyWPoKkrUdKfSnSY7HlpxTTS06KahFDi0sU2ppa1YpoVSSKVR0QI3loitOkUkioXsZK0KW1CqD2cvoUKFeePZAoUKFQgKMUVLQVCDtoVMtLOgqPbWtR2R4ety4Xf5Vj67+flR1aiXTAWN3SlDuA7M3rqqygwTDNHdHTz561u+G/ZlbZcz3m12yZfbVa0uCYfDCIIgCB06mpWEvtbBnbryma5Vddmqmp4SNz6GFPjn7mfH2ZWBvfceMAD6k6+tVfE/s7vW5NlhcWNNCG8mX9R7Ctu3HARy8vCpGH4hpoZC6Ec48aPH12WXtsTfQJrlI4pfwj2zDrBBgjSR5jcUS12fjPC8Pi1/zFGaDlcaMPCeY8K5Rxbg9zDXClzb7rjZhyjx8K7XR9fGb5d/N7HC6zoqx/MvBFWlimlNLBrpo5LQ8tLFNKaUGohTQ5NKFNTS1NEDoXRGhNJJqFaCNCiJoVQRy6hQoV549oChQoVCBinba0hRNP2hRSR+B/D2yxgCa6n2f4N8Gxbn5nhjpzbYCeW1ZnsPwgPdFy4IVYIDDc7iPb++fTiAe9EBRAB5ch61j6rL3PsRr6TF2rvZP4EO6zxJZiB/KpIH1BNWONBZGWOR96pMJxRLFpWd1WSxg77npR3+0Yay11VlAcpblPd/8A1SJ0lo1OaqtmZxSXFz6HR9vA8x7fWr3s3auByWGjKoI8RInziKr+FcYtuzhiCx5HwB3q4weOUKbslQoBZTyUkQfEabxSMmkuRtbe0izxD5QVM+Gmv/dZ7tNbF/Dsw1e2d9fl57eYNajGKty2txI2kazoROhqlwFv/NZGGjAjXYiSI8orJit4cs5J9Gv9Qisc5sNS/ZnM1pampPFMGbN17ZBgMY03E6R1FRQa99FKpTR4TLjcU5flCxSgabmlA0xMQ0OijBoloGrAYuaKioTUK0CaFEaFQLRzChQoV589iCjoUBULHrQEzmjxjUVruAdmmv7nLsc0Ac9JBbWROvuDWUw7EHSPUA+07fStbwnjFtVyskHQtmLQdebKQBprEa7a7hWbvU/L5G4ux18x0Dg/BLOHGUXGaNfBdpA29zrU/E357oOmvsKxXCsezuSSoGwCyFADHkf5ZrXowZc3mPUafWaxPHU809s3TcviVwRMF2fbGWgxfIpe5skvHxHAMsYUQByNWd3BW8LhbWEQ/E3LL3Sz5mZmLDmNT6AU92ZvE2ck5YLDQ7d5iYPqa552t4XesXlQuzg6o6kgkT8jQdx05zRytoNfUt/g16djLTE3bdxkV1llJJ1JMgagjbnrVZikawWtteLCDoddG3EnYHTTar7h+dMKiu2ZwsNlIMEklQepggVksfauMzO2omJ/45UFLu8j4Wtm17A4r4lq4gaVV5Uc00BIPhMkeZpWCxCnExrMKwBnQS06/wBW3hVP9nd7I1xerBiD0gCfStDfFtMSYt98aZsxMgwynSJ3O8nSlPCmzJV9tV9yt7a8KNzVFlwAygETqe8NeR1MTuum5rn7IymGBB6EQfrXaeM8O/xFhrY0YqIJHLQx9Nvy3rjOIQqxUtOWV56QTp3gDvNej/T8m47fY8t+pY0q7l6iAacSm1p1RXRRyKFoKVFLtrS2SiFsZC0ZWnBRtU2QYNCgxo6hZzChQoVwD2IKUooqWoqFj1takof+qZWnlpkoRbLbh/EWtnUZg0E/iBkGQfNQda2nBOPp8MgzAaSG+ZZAAiPu6Vztak4dypkcqmTCqRMXUVNc+DrHCrZJdBcyhmDKwGoVtYPjvr41FxvZoSSqX7hme9iIk9QQkj3FU+Fx5trZukarrB5oYg/mD0IHWrjEdupj4YJ6zAI6iuak0ztRk2h7A4JbC/EdWQgF2Bd2WFOg75JY+OlUGM4mbgIGg6UXE+PXb2hMA6EDpVSzwKpR7jHk9jS9jbgN4oTBYiG6EAkf+M+SmuivaFwlmthXQZXBGpA1VlbmvLw1Fcd4Dist4SxXNpm/Cd1PuB6E127BEsisyw+gJA6jY9Rtr0IpmNLbMXUN8Ml4VgVA6D1HL9K5Z27wot4piEWHAfQEa82kaSSDP9mukXr3w1LOQqhiCx0EHUGeW5rmvbjEm5dk7LovUyZJy8gQVIPMHwMb+jb7jk9el8PkzE0tDSCKWgrsI8/SH0NTESRURBUu3RidCGSmrlSWWo5FUWNRQpZFCoQ5bR0VHXAPYgFOoKQoqQgopIx1BT6Cm0FSEWnSjJkYpUqfgsCbmi77kHSB+InaPGoyLUm7inCZUEjMsIJAJndo1NHe1O0Lx6daZu8RZRrFtUMhQVBIiQEALQeRZm9qwuJQo+mm3r0NbG3cxVyzJUBFVQTl5tsVY66+ev0qn4lgAyBhuMynzADA/Ue1cWXXc9neblyu0iJekT1pi9dqHZuXGBVbZMGCZAUde8abxZYMoMHMQGymeumbadPGm69CKl5HwXOXKpMsAIME6gGPf3iu/wDZO6zYa2twj4iqocAz1K6cv761yzDWVw1hcS+XOxFvDJpEmc1wjmFGYjy9aq+wvbu7hsSWvublq8yi7maXWNAyg7xJkDcDrpR4lvkR1Fc6O48SsfHtsBB6BhIzK3uD4c9Kz3HOAHGWle3bKXElMrwuZVJECNCOanbU9adwl/Mym1c7mS28KQYlYZSeplN9dK0GB4ojj5gI3p0X21teTJkxK50/Bx/iHBr9jS7bZehIlSegYaH3qEg1rr/E+PWlY28huKSEYqAwDNqFIbQ6dJ8qpMZwzB3l7qIpjQplRpMGTl7p8mX1FdHH1e/qX4ORm/Tmvof5MErRUi02lSeIcHa3BDZlJy6jK6t+Blk67RBObcSKi2xFbJtUtpnMyYqh6paHws0TJRqaU4oxZFZKKnXoVCaOR0YoUYFcE9ihaCpKCmUFSUFFIFsdRakotMJUi3TpM9D6ChfRyvcMMCDMwAJglj+HXWpXD8C90nLACiWYmAB+p8BVjeRIFu2sCNWYyWMmDlAgSI5mNRvqZdbXauWDjjVd1PSL7slxD49x1eWnLcLFjrcQMVYKQIB73vyocWth8xtju98N1zK6rH0X0NZ3AcTOFxKmQyQFeAR3TzE8wDPTU+mkwmf/AB1/Df8AtOly7bPJiVQsAeoKtpyy1y8mLtp6/s7GHIqS9DH27ZR2bL3SVM5Z1IiIVSQdDqWE01i0NxkYnKAyiYymJBYjUkADTfmK6ZwPs9bvK3xBzzLlJHTfqNtD0rJfaTw6xhMiWsxuXCzNqYCIMg0Yz3mkzt3NBFSW6a0NvthNMy3aPizXisGAjEIo0yIqoqAdNFJ82NVlq0zkagZu8xidiO91B15RRJhmJM6Hb9z+laPsbhTcxSlVkJqFkKGjQISeR1PkjVqlJcGCm65Z0fheazcNtjByKRAgMACCDrv8p9DUO9izhrZuiTnBKKx+83ygzuBv5A1N4lbGhvJctsdmKkqR0DJIyxPTes12s4sGdLaOMqKGLA6FnAgjwCkH+rTapMpsB00iow2Nf5izy852LOFMEnkDGo10OgHjKW7U3LJyoxGUiHSFJVVyhG01iBrzikW8UGyjdcxIHLVp8ZPSZkwKqsbaliTM/eM6kgakrGhOvM706p40hU09ts2fD/tGVly4q3JjLnQsMynkwHTUzB35a07wy4l5VDXUzuFNpiPhm+dmQgSi3gYlQ+5251zb/DNvE+I19NNvKpeGxzWTJQMoYLessCJKyFcTqjwSAw1DLJ+aKLHdS9oDNhjJOmdBJjwjQg6EHpRfEplcT8VBfVw6OdWBEh4kq6gyj84O+sSKbZq6s0qWzz14nFOX6Dlx6Ko7vQq9gdpzGlqKRTyLXDPXodRakIKbQU8tMkVY4gqVhrZdgo3JqOgqdhFAGafDxAkSfDfej3wJ1zyXC4pEX4aAZQsy2kzHz7wZ0gSCfekp96VOadTmEAAkNAkbnmdhPo3cAzyGmRLZlUmYzaeIIXvbeFNcSQIBkiGYiZ1MazHSCJ6acyarXavsUm6a92V2JfO5PIyAYiQBA08oq/7G417nEsOSRqXRuhm04BPidKzc7nwP7UrB4trF1LyfMjq/ScpB/SPU1lpb2bofbo7wOGFbeVWZSMy5lMHKQVnx0M+lcY7VY9b+Ld0kop+GhLFjkSQGzGS2Y5nk69411rtlx4WsCbtttb6qloz/APIs5vRMx8wK4ZxLIGCWzvALa6wILAHaelLxQlyNzW64Y2jSJ6zHltXR+w/B1TC57igm82aGAIyCcmh0O5b+qsDgrCXLiozFUkZsqF2yrEhVXUmJ9q65gcdh7ihLN1CVAATZ1EaDIdRp4VphcmTI3oaxMWbbsjuiBGLKjsAwjVQplQTtoOdc4xV5odmbKW72aDlzsxLqPw7iOgWJGw13bXHG2EtbFyHOo0VT3efNtR/IayjPnKgNMrAhdBrsJ30IJPOSOVMSXoKdP1EqcqNczbkhdwRocxA1Cyc28TO2lQMQuZAVlnJA0Eu0wFaB7c9xTjH495bKDvSqgMwVJ1JZnJEAE/WtjYwdvCL3JOJKhQzIjI2fu5EUyVU+Pe0JmBADJlmeGMxYKt7RC4NwG3aZGxbKwOX/AEbhBSQJLE6hlJgrG67naqztsbS4nPadrli53iDK6iA6HXVh3Wnqy1cPYJZ7jQonvOe6oABEk7AbmsPxRwbnw1bMqkiQdCzRmI9gPSkYM1U2/Q1dRgxykl5RZdms6XmSZR0zg8iAYVvAiWHgSRWmZ6yPZvFBbmQiZDBTzBiSPIx7gdTWnZq7HTP5Tz3XT/6b+wt2oU0TR1oMOmc7AqRbWmkFSUFcVHqmKUU8tNqKdWjQljiUL2JIABPyyBrpBJOUzykk6RqT1pVtCTAEnwqPeE6HYz71V00SZT8lvw/Hm6CgCj8KljuSM2sTJOug5bawXrtyLct0y8pLd2TI8QvXbnM1m8DeFu4M0RmEzOnInTwnrVpj8eGACiFzZtWzGSIifCDU7/l5B7NVwhmYHp+tNu8zM6yNp8aYOJU8+X60oEEyDz50rRoLjEcWu3bFm1caUsIyoOcMQTm6kAADwHnVLbbM7P6D01P6e9LxFwQF0jxPIVFuXxGVdB7c9aiRG/cuuCcPN++lsTuGYgwVRTmYg8jyHiRW07W4PD27YuC3Nx7iqiZjkZiZMq+YKIB1UKfEVC+zfhxCPiGE5zkSfwLqxHWWgf0VX9uOJZ8WLKsYtIwETPxLi6+wKjwM0SQttt8FXdxl1mGcwgXRQ7sAXI5k5o0gAyPOaSEOwPegBW+9mYQBrAB5DY+GgppnbVpYknQHxWYBkk8oA86veF4b4dkYy4ssXy2xvlZ1nOJ6gEL0CztqDqlKKiHdaNDwHsg2DQ375DXrgdco7yoA0MpOzNI1jTkOprlw7d52uQ8woB74RSB3fMHfaT51p8d2gw74RXuOAwyudyM1xQGUEbtnV+7qY12NYzEdo8KMzy2cL3RlMsTyme75n9K5lzdZXpPT1ydWLxxi1tbW+C/t4y5Zt/Ezi1bvK6B3ZGRykh7boYZS3eIYMNVI3Irl1u3bUr8Rmj7wUDN6FtB61b4ji7XLRt6hnZTc0UJlT5AANzOpJE90amTVDfMt9K6MpJJJHMe2236l1hMfg7cMuHvMwMgtfUDaNQtsaVoExAuAOqZAwBC5s0T/ABECetYNTB1HmNvStrhWXIsGRlWD4AD61s6Z8s53XStJ6JDGipBNCthzODEIKfWkIKcFchHpmxYpxDTampuFssVLQMpDCTvIHdjp3o18COdXvSF629CEuZdZiQR6EQaj3RoQf75z7xSWJOvXbyqM+I5H0PQUt8sYuFoRdvk7gHxjX3o7t4lVB5D8tBPoBTbo3zEadRt70hzt5VZQQEmptnCEd4nry8OnOj4fZGrnb+5qYssSemn7iqbLSIN3C+/XlAA1iBzoreE17xjbXpO59KmhZJnyHp/z+VPWMPnOgzc9tOuuo3iInWai23pEaS5ZYcK7UXrHdB7g0VG2VRsBz0FZ3/Es91rjHvMzOT/ETJpy8j5lXKczNAU82JjTrJIrsS9ieE4dEW8lx7pUBm+K4liNSQpAAJn08qp0p4Zcw6+lbOf8DwVt3W9d0sK6hgdjlVMyCfugasRuIGokifi77F8Rh3MBW+b7qGy5Bc9Bka4P6l33qZjk/wAp8NbtwbV1VVFkkq5Nt0HNu/8ACnXUk7/MYHbnguMsBRctNFxUa5cQSrsqwqErtlCyZjMxJjQUHNvY16xTr1MpxTiOdlCCLaHuKdzrq7fxNGvTQcqriST4k/nQIpeHYhgQJ8Kdoz735LBefl+VRsONSx96cvXfw+vn0HWjCXYG4GwkfvUQTGbylpaQRWg4C82Y6Mw/I/rVfgcRcs98W0eCZDLrEd4EiGKkSIMjwrRHtJZxSJaTBpYZBIa22jKNCpXKOZmZJ361owNTRj6qXUeAs1HTRNCt2zk6MolLBptTSq5R6AWDUuxxHu/CMKRmhupYgiTyiBpUMU0yd8HSD4geFDS2i5bXgee9qFZSs6yeY/sVDxG9XHFblsW1tKVYgBy38R3APSqQueevnVItgS4R5dOXtSWMmk07aQlgB1/KrBJ9tYAHhS0vwNepANLKQNfU+2golAJhdtB7TPLy5j1qpl09IKqUrbIvx310MdY0A5VruBcFxL2c9uy7gGWKidSAcoG5hcpIExJrPNijb0UxK5YidPLlty8a0/ZntNi1AFmxcuKhl/gozQWOpIA0mJ15jeNtFy8fK5YvG/icVwi77LcAvBTxC0LV28Q6W7Tgq1rI5XMCdM+hlSBGY6zpWvtG2cI9rEsyu7S7GUdiHlSARIEARG2461V4jjHc+JlCXWLEse7nZMuZXA1DgFBm221Iis5xbtA14oblxUI0ErrrGmxB1/OsLVXTbOilOOUl/f8Av9mjuWMJ8Zb9lovI+cOSShbnmXnMnaN63XC+J2sVbYECQcroYYCdtdiDy/euJ2Fd3/1u71AUx/SAKm2cTctnRiCJErKkj02o5ntAyJWtmx7QdgeFOw0a27Oqk2nC5S8kEoQVgnTb8qhWvscwo2xN0gnXRZgbrpHjWc4lx64xR3MsGUyJzMVbMJnTSneC9psRbt5S5MO7TrJzEFucb5tutA8tqta4B/bLt7kzd4D7M+H2yD8MsRtmY+u0TWkwnDcNaGVERY5QPyrnq9tr0RmiBv1+lRX7UuWJOpOtX3re9EWGtcvSNp2m7K2MUrOgFu+NUu2zkYsB3QzLB9eU+lcOt8YBvZMUoLhoa9atp8RxmgrcEqGM/fBDAjXNsOgJ23xKjuhRp0nxGprlPESXxbHYtcDEjqxBJHrNaMVNszZcSlPZeMaFEzUVdM4RmFpQNNq1LrmHcHF3rRcM7IYvFJ8S1hiVIkO5RAw3lQ5BI8Yiq7s5gBiMVZsnUM6hh1Re84/2q1ejLCQoA2ikZcjlpIdihNNs808a4TewzhL1lrZM7jQ/ykHKw8utU5r01x/htvEW2t3UV1PI/mDuD4ivPnHuDvhrxQg5WJNtjsyz16jY/wDNXjyd3HqXlxdq7l4IFnCO0EAAHmTFSrIFtS7bnYVJTaKqsTdLHwGgp1IzzQ4t4s0sdtgPHTQetWVpMqyfOoeAszGnj+37+oqzv2ywyqCTBOnQAkn2BrR08eaM3UXtqSoxKtmOYEHp0rf9h7uIsYV2D5FOa+oHzHJkVyf6YIHQTs1Z3sz2ea++Zgci5hGnfcI7Ku+oldfbmSNfxjHIiyFLIrhjl+/bxmHhlUaAZYI5asOZrLmvfBv6eXPI5x7tQrqbeIhgoV0eCHAdVYOImNCog9QKy1riNgsCMQSdR3lMQd918Kz3E8azwpMgAAnkY2UH8K7CoNsxNBE65LvI3x6G6tY3CL3y6hokkZvppQPaTDk5QHYdQIHuxFYdn8ZFGcQdhA0jSjB+Ib2wLN7vM6AmAFLiVXUxEjNcaOWgA3mp9vCqoAAMDrz9q5dU/B8Xv2vkuNHQ95fY7UuMXa3Te9/8C+Lxr0OhNhwdRTZsGOXvVfg+MXWsLcdUOZmWACNFAknXTWfak3OLOdlUfWnLE3ygH1MzwyZdwxrP37K/HJj5FAP8xn8h+dSbuKuNu7ehIHsKYGUTlEAmd5Mnck8zTsWHtrbMufq1U9soeJoU3NCtmzm6MyKcFNg0oGucdg1v2buBxC3P4XjzyH9JrvVk6V5n4PjjYvW7o+4wJ8tj9Ca9EcJ4il22rK0yB+VY861WzZg5hr7k3FrINcu7fsLlrKFkWmD5umYhAP8A7/Sun4sjLrWV41w4PgsUApZ2t9xeZYOpBnlBVd4ocX1rYeRtYmcXU1D/AMKS8EGC2mm866DnWqscFtpHxHLt+FGhAemeDm9IHiajX0ylgEVBzI3I/idjJHrFdNY9+eDk1lUrjn0I+HsBdvWTOvmBtU7h2AuXbqhCRB1YcgdI9Zj110moFjF5ri2rKB2Y5QWJVZ5nSDA11kV0zAYRMNZ+IEGYKHUCe86hruzSY/yrYid397yZ5ldsg4emuq7q8ES46YW2BaGqDOo2gWXt3oJ0mbWIb2POZ57xzFkwFbuJmto2slM7srEH7xBjwAFXnaDGZna2D3VYBjqCcguW0A6o9lrZP8oFZPikx/MwI9ARt6/WsCadaZ074ngYRxt4RFIfDQdNp5/lUapFnEkb6inaEb9xJstsB+n97Un4DdKnW0Bgj29TQLEcutTZO1EQ2CASd42orNkt5fmegp27czTAO2pqfwbCtduIgWe9mYD8II0HrFFKb4BpqVs0mLtKmFsKpU8pURJVRmzDkwYnzB9quauO09xRcW0pByL3iNJdoJkdYiapJrTHhGLLy2KJoppJakzR9wrtY5moUaWHOyOfJSf0oVffPuT4V+zM3Rg0gGlA1jOiLBre9guP5GW07RBgHwnb0/vasADUjCuyupWZkQBuTOgAG5peWFU6G4bcUem/mtyCDIrB/aHijbSxbDMM7wQNJyq8z65dK2fDiUtIrmHKrK85iSIqq7WcEtYu1mKkXLZzoyzII6j7wMQR7Qaz4GptOvQ09RFVjcr1ObWrg2b3qj7RZnVSk5QcpXmTyMc/LxpnimOMhVMEd4+U6CrbBMvwzdbQwO6eQP3tOexHOGHMg10Oqy91fKcrosOo+f8Awb4LaGHA2zlipYE7spyIPCVB8d+SE6XtZ2hCqChgtBtxsqlkuKxEQcqph9Dv8Q+NZGWLEr3iCGVeZZXVgNtyA3vVbxdSwVsxbQgGQQER3toojkAh15zWSZdM3O+1EbEYvu5VPh6efU1FuXy2WfuiKaJoqNSkLdNk5LaMJ8v+aS9gchrH60zYMHz0qU0iY32HpVkGgxQjX+5qTbxQI9/yqIbDSNdaIIw+tTyVsnfEQjx6AcvQ/SrvB8dt2LRNpVW6e7OUkzHdYMW28orLMoOu1LwiFnUATrPoNT9BRy2nwBklNcm0sYjChf8AMQu51dyX7znVmjQCTNKPEsOPlw6eqz+bVSfHX8HuTRHEfwrR/BXrv8lPqdeNf4i8/wDXUHy2UH9C/saSe0lz7qqPKP0WqQ4g9F9qBxL9foKL4M+yK/d3/L8JFw3H7/Jj6T+9CqU32/EaFX8KfZAfur/kyhoxSaMUkcLFdB+yvg9t7hxd1hFtsltetzKCWPkGEeJ8K54DVnw3GXLasqXCJI7gYjNMgnzEL/YoMibngbiaVLZ6AxDKWzq6TEAtynfXb6VDw/FksZ/j37bCZUrObKfusOcdRvXKbNtTbzNjSHKz8MI5E/hLZvrFV167ClmaYBrKo+5veXjTRpO0mGw1/F/EtoqiUdmtlirTmAzLACNKgnr6kir4jdLF05Nbc/1oS0eyDfm22pip4bxRgrKY77KJESIkgCZ0Oo9ee1HxXGiQASGXMZWd3RRGsRMD0J0kmnpa4MVUqbaWiB/imRzEg7azIkQw16yR+VX+OHdZQRyVhpMoIVgP93+6q7DYW1mVhezuGzGAwXKqggHMszmgTtSsVfgx03rX0ynlsydRdLSI1kAXFKqCQw+YaGDsR0pvF2nzMxQRJOgBUa8iKbxDwARpOw5+flUdLmsFiBz3q7pAwqGKWt1hsalJkGwB+vjRuAeVZtmjQwuJbnrSzihHy/Wm7lqNR7UyKmibY9du5uUUrCznWJ3GvSmKlYL5o6Sf0o58gW+GWVTOGYBr9wW7YlmmNY2E7mobMOVLt3yhzISrcipII8iK0Vty9efTZiWkwriwYjUaHzFNk0Gek56IgqaFILUVTZWiroUo0VZTeFRzRUKhC74Pbw727nxGuC4sfDykZD4Nz5UxirishUTmBnSMpUco3nxqvtzDR0k+lLw2JyOrFQwBnKdjrMHwoKjXKGxkT4Ymy0A6xsR5j/ujuKzd4jTXXzJPnudz4UvimN+Nca4EVJjuoIUQOVQ5ql7lU14RZ4ZwltnjvMcg8hDN9cmvnUTEXiTvPj+1OY05ctv8Ag/zHVvqSPQVEZppqrU6FNbewSaTQpSqSYFAELsrrJ0AqSzz19jQt2QOUnx/SluaENIaOvI0RsDxp0UYqyaIws6VIwdvmaFSFPSm41tmfO9LSDoE0KFaDIEaKlUBVFiDQozbY7KfY0Km0M7X7FeaKhQrMagjRUKFQhOwSD4dwxqMonzzftVc1ChV34QM+WKUaHy/WncB/qJ/Mv8A5ChQpYYi/wDMfOmqFCifkpAqbhRpPjRUKFhz5HzSLlChUDYXKmQ5jehQqwGGh7w8/wBKmpsPKjoU7GZcwZo7RoUKaJH1xDBRB+gpF3EPAOY0KFKZtnw/6C+KxUnM2/U0VChUQL9D/9k=",
                name = "Steve Morse",
                type = ContactType.AMIGO

            ),
            Contact(
                image = "https://theentreacordes.files.wordpress.com/2019/08/metheny-solo-photo-2-extralarge_1369249802486_2.jpg",
                name = "Pat Metheny",
                type = ContactType.AMIGO

            ),
            Contact(
                image = "https://media.gettyimages.com/photos/american-guitarist-joe-satriani-performing-live-onstage-during-the-picture-id170323445?s=612x612",
                name = "Joe Satriani",
                type = ContactType.AMIGO

            ),
            Contact(
                image = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/a/3/7/2/a372ee687749cef5ec6188750852ac96.jpg",
                name = "Jimi Hendrix",
                type = ContactType.AMIGO

            ),

            Contact(
                image = "data:image/jpeg;base64,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",
                name = "Steve Morse",
                type = ContactType.AMIGO

            ),
            Contact(
                image = "https://theentreacordes.files.wordpress.com/2019/08/metheny-solo-photo-2-extralarge_1369249802486_2.jpg",
                name = "Pat Metheny",
                type = ContactType.AMIGO

            ),
            Contact(
                image = "https://media.gettyimages.com/photos/american-guitarist-joe-satriani-performing-live-onstage-during-the-picture-id170323445?s=612x612",
                name = "Joe Satriani",
                type = ContactType.AMIGO

            )
        )
    }

    fun dataTransaction() : MutableList<GroupTransaction>{
        return mutableListOf(
            GroupTransaction(
                type = GroupType.NAVTITLE,
                title = "Transferir"
            ),
            GroupTransaction(
                type = GroupType.TITLE,
                title = "Hoje"
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
            GroupTransaction(
                type = GroupType.TITLE,
                title = "Sab, 10 de nov."
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
            GroupTransaction(
                type = GroupType.TITLE,
                title = "Sex, 9 de nov."
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
        )
    }


    fun dataPayment() : MutableList<GroupTransaction>{
        return mutableListOf(

            GroupTransaction(
                type = GroupType.MENU,

            ),
            GroupTransaction(
                type = GroupType.NAVTITLE,
                title = "Mais Usados"
            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Creative Electric Service",
                subtitle = "14460 Beier Curve, Venamouth, VT 09239-2090",
                image = "https://i1.wp.com/www.creativevivid.com/wp-content/uploads/2018/03/Circle-Logo-Templates.jpg?fit=600%2C340&ssl=1"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Pyhton Water Company",
                subtitle = "Burgerplatz 28, 15583 Eutin",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGXRYz1Ph1MBE3T3iPEhclJZYaC-_GLhPW0B4YhY6QEJUDIarRKLvOoacpSXipDcCgdTw&usqp=CAU"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Link3 Technologies Ltd.",
                subtitle = "6798 Dare Underpass",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRRpSOuPWBzx8FQlQoztgxbTQPFpizvITcFw&usqp=CAU"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                title = "The Circle",
                subtitle = "6798 Dare Underpass",
                image = "https://upload.wikimedia.org/wikipedia/commons/4/4c/The_Circle_Logo.jpg"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Creative Electric Service",
                subtitle = "14460 Beier Curve, Venamouth, VT 09239-2090",
                image = "https://i1.wp.com/www.creativevivid.com/wp-content/uploads/2018/03/Circle-Logo-Templates.jpg?fit=600%2C340&ssl=1"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Pyhton Water Company",
                subtitle = "Burgerplatz 28, 15583 Eutin",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGXRYz1Ph1MBE3T3iPEhclJZYaC-_GLhPW0B4YhY6QEJUDIarRKLvOoacpSXipDcCgdTw&usqp=CAU"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Link3 Technologies Ltd.",
                subtitle = "6798 Dare Underpass",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRRpSOuPWBzx8FQlQoztgxbTQPFpizvITcFw&usqp=CAU"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                title = "The Circle",
                subtitle = "6798 Dare Underpass",
                image = "https://upload.wikimedia.org/wikipedia/commons/4/4c/The_Circle_Logo.jpg"

            ),


        )
    }



    fun dataCardItemOfertas() : MutableList<GroupTransaction>{
        return mutableListOf(

            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://expressodelivery.com.br/blog/wp-content/uploads/2017/06/cupons-de-desconto-pizzarias-810x420.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://media.cuponeria.com.br/2021/12/fb6532c7-cupom-o-boticario-cupom-secreto-de-frete-gratis-em-todas-as-compras-no-site-o-boticario_3637-420x226.jpg"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,

                image = "https://i0.wp.com/reserva85.com.br/wp-content/uploads/2020/06/Cupom-de-desconto-para-comprar-vinho-em-promo%C3%A7%C3%A3o-RESERVA85.png"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://i.ytimg.com/vi/7g2YEqTYw9w/maxresdefault.jpg"

            ),


        )
    }



    fun dataCardItemDescontos() : MutableList<GroupTransaction>{
        return mutableListOf(

            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://painel.solidweb.com.br/uploads/16/16_2019-06-13_01-06-33_4_324066624.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://www.istoedinheiro.com.br/wp-content/uploads/sites/17/2020/12/amazon-divulgacao.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCkLoG1OCzKQxJrWxWMe1wKQA504I1KYkZ5EzL-Si4AuJhzuDMKx47fmf9FVxqry-BQp4&usqp=CAU"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                image = "https://trademap.com.br/wp-content/uploads/2021/05/Magalu-divulgacao.jpg"

            ),


        )
    }

    fun dataTransHomeCard() : MutableList<GroupTransaction>{
        return mutableListOf(
            GroupTransaction(
                type = GroupType.NAVTITLE,
                title = "Transações"
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),

            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
        )
    }

}
