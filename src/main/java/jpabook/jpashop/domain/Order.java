package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ORDERS")
public class Order  extends  BaseEntity  {

        @Id @GeneratedValue
        @Column(name="ORDER_ID")
        private Long id;
/*
        @Column(name="MEMBER_ID")               // 외래키를 아래 객체로 연관관계로 변경
        private  Long memberId;
*/
        @ManyToOne
        @JoinColumn(name="MEMBER_ID")
        private Member member;
        private LocalDateTime orderTime;

        @Enumerated(EnumType.STRING)
        private OrderStatus  status;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public LocalDateTime getOrderTime() {
                return orderTime;
        }

        public void setOrderTime(LocalDateTime orderTime) {
                this.orderTime = orderTime;
        }

        public OrderStatus getStatus() {
                return status;
        }

        public void setStatus(OrderStatus status) {
                this.status = status;
        }
}
