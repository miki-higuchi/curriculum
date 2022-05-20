-- 1. 店舗テーブルから店舗名を抽出しなさい。また、列名の表示は別名で'店舗名'とすること。
-- [回答]
SELECT store_name AS "店舗名" FROM store_table
 
 
-- 2. 店舗情報を店舗名のABC順に抽出しなさい。
-- [回答]
SELECT*FROM store_table ORDER BY store_nameAbc ASC
 
 
-- 3. 在庫テーブルに店舗テーブル、商品テーブルを「内部結合」し、店舗名・商品名・在庫数を全て取得しなさい。
-- [回答]
SELECT*FROM stock_table
JOIN store_table
ON stock_table.quantity = store_table.store_name
JOIN goods_table
ON stock_table.quantity = goods_table.goods_name;

 
 
-- 4. 商品テーブルから全商品の単価の平均値を抽出しなさい。
-- [回答]
SELECT AVG (price) FROM goods_table
 
 
-- 5. 店舗コード='EA01'の在庫数の平均値より大きい在庫数を持つ店舗コードを抽出しなさい。
-- [回答]
SELECT store_code, quantity FROM store_table
WHERE quantity > (SELECT AVG(quantity)FROM store_code.EA01)

 
 
-- 6. 商品テーブルに「商品コード='M001'、商品名='マフラー'、単価=4500円、更新日付=本日日付」のデータを追加しなさい。※実行後のSELECT結果も貼付すること。
-- [回答]
INSERT INTO goods_table
(goods_code,goods_name,price,update_day)
VALUES
('M001','マフラー',4500,'2022/05/19');
 
 
-- 7. 在庫テーブルの商品コード='S987'、かつ、店舗コード='EA01'に対して、「在庫数=10、更新日付=本日日付」で更新しなさい。※実行後のSELECT結果も貼付すること。
-- [回答]
UPDATE stock_table
SET
quantity = 10,
update_day = '2022/05/19'
WHERE goods_code IN ('S987
 
 
-- 8. 7で更新した商品を削除しなさい。※実行後のSELECT結果も貼付すること。
-- [回答]
DELETE FROM stock_table 
WHERE goods_code = 'S987';
