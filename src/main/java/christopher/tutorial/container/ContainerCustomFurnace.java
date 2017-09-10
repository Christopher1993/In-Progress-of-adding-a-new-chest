package christopher.tutorial.container;

import christopher.tutorial.tileentity.TileEntityCustomFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerCustomFurnace extends Container
{
	private final IInventory TileEntityCustomFurnace;
	private int cooktime;
	private int totalcooktime;
	private int furnaceburntime;
	private int currentItemBurnTime;
	
	public ContainerCustomFurnace(InventoryPlayer playerInventory, IInventory furnaceInventory)
	{
		this.TileEntityCustomFurnace = furnaceInventory;
        this.addSlotToContainer(new Slot(furnaceInventory, 0, 56, 17));
        this.addSlotToContainer(new SlotFurnaceFuel(furnaceInventory, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnaceOutput(playerInventory.player, furnaceInventory, 2, 116, 35));
        
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        
        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
	    }
	
	public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.TileEntityCustomFurnace);
    }
	
	public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = this.listeners.get(i);

            if (this.cooktime != this.TileEntityCustomFurnace.getField(2))
            {
                icontainerlistener.sendWindowProperty(this, 2, this.TileEntityCustomFurnace.getField(2));
            }

            if (this.furnaceburntime != this.TileEntityCustomFurnace.getField(0))
            {
                icontainerlistener.sendWindowProperty(this, 0, this.TileEntityCustomFurnace.getField(0));
            }

            if (this.currentItemBurnTime != this.TileEntityCustomFurnace.getField(1))
            {
                icontainerlistener.sendWindowProperty(this, 1, this.TileEntityCustomFurnace.getField(1));
            }

            if (this.totalcooktime != this.TileEntityCustomFurnace.getField(3))
            {
                icontainerlistener.sendWindowProperty(this, 3, this.TileEntityCustomFurnace.getField(3));
            }
        }

        this.cooktime = this.TileEntityCustomFurnace.getField(2);
        this.furnaceburntime = this.TileEntityCustomFurnace.getField(0);
        this.currentItemBurnTime = this.TileEntityCustomFurnace.getField(1);
        this.totalcooktime = this.TileEntityCustomFurnace.getField(3);
    }
    
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.TileEntityCustomFurnace.setField(id, data);
    }
    
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.TileEntityCustomFurnace.isUsableByPlayer(playerIn);
    }
    
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (!FurnaceRecipes.instance().getSmeltingResult(itemstack1).isEmpty())
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (((christopher.tutorial.tileentity.TileEntityCustomFurnace) TileEntityCustomFurnace).isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }

}

